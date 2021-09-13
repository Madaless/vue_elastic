<template>
  <div>
    <h1>EntryList</h1>

    <div class="todos">
      <div v-for="entry in entryList" class="todo" v-bind:key="entry.key">
        {{ entry.title }}
      </div>

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
          <tr>
            <td>1</td>
            <td>Clark</td>
            <td>Kent</td>
            <td>clarkkent@mail.com</td>
            <td>Lorem ipsum dolor sit amet...</td>
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
</style>