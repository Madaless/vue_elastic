<template>
    <div>
        <h1>EntryList</h1>

        <div class="todos">
            <div
                v-for="entry in this.entryList"
                class="todo"
                v-bind:key="entry.key">
                {{ entry.title }}
            </div>
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
  computed: mapGetters('entryList',[entryList]),
  created() {
    this.fetchEntryList();
  },
  setup() {this.fetchEntryList()},
};
</script>

<style scoped>
</style>