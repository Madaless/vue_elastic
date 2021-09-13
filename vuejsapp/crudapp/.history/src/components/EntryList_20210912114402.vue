<template>
  <div id="entryList">
    <h1>EntryList</h1>

    <div class="todos">
      <table class="table">
        <thead>
          <tr>
            <th>Row</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Biography</th>
          </tr>
        </thead>
        <tbody>
          <div v-for="entry in entryList" v-bind:key="entry.key">
            <tr>
              <td>{{ entry.title }}</td>
            </tr>
          </div>
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