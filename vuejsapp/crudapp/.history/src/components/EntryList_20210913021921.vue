<template>
  <div id="entryList">

    <div class="todos" >
      <b-table :items="entryList" class="table table-striped table-dark" :fields="fields">
        <template #cell(name)="row">
          {{ row.value.first }}
        </template>

        <template #cell(actions)="row">

          <b-button size="sm" pill @click="row.toggleDetails">
            {{ row.detailsShowing ? "Hide" : "Show" }} Details
          </b-button>
          <b-button size="sm" pill block variant="danger" v-on:click="deleteEntry()">
            Delete entry
            </b-button>
        </template>

        <template #row-details="row">
          <b-card>
            <ul>
              <li v-for="(value, key) in row.item" :key="key">
                {{ key }}: {{ value }}
              </li>
            </ul>
          </b-card>
        </template>
      </b-table>

      <!-- <table class="table table-striped table-dark">
        <thead>
          <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Status</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="entry in entryList" v-bind:key="entry.key">
            <td>{{ entry.title }}</td>
          </tr>
        </tbody>
      </table> -->
    </div>
  </div>
</template>

<script>
import { mapGetters, mapActions } from "vuex";

export default {
  name: "EntryList",
  methods: {
    ...mapActions(["fetchEntryList"]),
  },
  computed: mapGetters(["entryList"]),
  created() {
    this.fetchEntryList();
  },
  data() {
    return {
      fields: [
        {
          key: "id",
          label: "id",
          sortable: true,
          sortDirection: "desc",
        },
        {
          key: "description",
          label: "Description",
          sortable: true,
          class: "text-center",
        },
        {
          key: "status",
          label: "Is Active",
          formatter: (value) => {
            return value ? "Yes" : "No";
          },
          sortable: true,
          sortByFormatted: true,
          filterByFormatted: true,
        },
        { key: "actions", label: "Actions" },
      ],
    };
  },
};
</script>

<style scoped>
#entryList {
  padding-left: 30px;
  padding-right: 30px;
}
</style>