<template>
  <div id="entryList">
    <h1>EntryList</h1>

    <div class="todos">
      <table class="table">
        <thead>
          <tr>
            <th>Row</th>
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