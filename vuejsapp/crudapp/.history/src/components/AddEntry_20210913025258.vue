<template>
  <div>
    <b-button  v-b-modal.modal-prevent-closing pill block variant="success">Add entry</b-button>






     <b-modal
      id="modal-prevent-closing"
      ref="modal"
      title="Submit new Entry"
      @show="resetModal"
      @hidden="resetModal"
      @ok="handleOk"
    >
      <form ref="form" @submit.stop.prevent="handleSubmit">
        <b-form-group
          label="Name"
          label-for="name-input"
          invalid-feedback="Name is required"
          :state="nameState"
        >
          <b-form-input
            id="title-input"
            v-model="title"
            :state="titleState"
            required
          ></b-form-input>
        </b-form-group>

        <b-form-group
          label="Description"
          label-for="description-input"
          invalid-feedback="Desc is required"
          :state="nameState"
        >
          <b-form-input
            id="title-input"
            v-model="desription"
            :state="descriptionState"
            required
          ></b-form-input>
        </b-form-group>

          <b-form-input
            id="description-input"
            v-model="description"
            :state="descriptionState"
            required
          ></b-form-input>

          <b-form-input
            id="status-input"
            v-model="name"
            :state="statusState"
            required
          ></b-form-input>
        
      </form>
    </b-modal>
  </div>
</template>

<script>
export default {
  setup() {},
};
</script>

<style scoped>
</style>