<template>
  <div>
    <b-button v-b-modal.modal-prevent-closing pill block variant="success"
      >Add entry</b-button
    >

    <b-modal
      id="modal-prevent-closing"
      ref="modal"
      title="Submit new Entry"
      @ok="handleOk"
    >
      <form ref="form" @submit.stop.prevent="handleSubmit">
        <b-form-group
          label="Name"
          label-for="name-l"
          invalid-feedback="Name is required"
        >
          <b-form-input
            id="title-input"
            v-model="title"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group
          label="Description"
          label-for="description-l"
          invalid-feedback="Desc is required"
        >
          <b-form-input
            id="desc-input"
            v-model="description"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group
          label="Active"
          label-for="status-l"
          invalid-feedback="Status is required"
        >
          <b-form-select
            id="status-input"
            v-model="status"
            :options="statuses"
            size="l"
            class="w-75"
            required
          ></b-form-select>
        </b-form-group>
      </form>
    </b-modal>
  </div>
</template>

<script>
import { mapActions } from "vuex";

export default {
  setup() {},
  methods: {
    ...mapActions(["addEntry"]),

    checkFormValidity() {
      const valid = this.$refs.form.checkValidity();
      this.nameState = valid;
      return valid;
    },

    handleOk(bvModalEvt) {
      // Prevent modal from closing
      bvModalEvt.preventDefault();
      // Trigger submit handler
      this.handleSubmit();
    },
    handleSubmit() {
      // Exit when the form isn't valid
      if (!this.checkFormValidity()) {
        return;
      }

      this.addEntry({title: this.title, description: this.description, status: this.status});

      // Hide the modal manually
      this.$nextTick(() => {
        this.$bvModal.hide("modal-prevent-closing");
      });
    },
  },
  data() {
    return {
      statuses: ["no", "yes"],
      nameState: null,
      title: '',
      description: '',
      status: '',
    };
  },
};
</script>

<style scoped>
</style>