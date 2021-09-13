<template>
  <div id="entryList">
    <h1>EntryList</h1>

    <div class="todos">

       <b-table
      :items="items"
      :fields="fields"/>
      <table class="table table-striped table-dark">
        <thead>
          <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Status</th>
            <th>Title</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="entry in entryList" v-bind:key="entry.key">
              <td>{{ entry.title }}</td>
          </tr>
        </tbody>
      </table>
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
};
</script>

<style scoped>
#entryList {
  padding-left: 30px;
  padding-right: 30px;
}
</style>