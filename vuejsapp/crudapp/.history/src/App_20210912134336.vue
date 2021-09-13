<template>
  <div id="app">
    <b-navbar class="navbar navbar-expand navbar-dark bg-dark">
      <b-navbar-brand id="header" href="#">REKRUTACJA APP</b-navbar-brand>
    </b-navbar>

    <b-row>
      <b-col sm="8"><FilterEntry /></b-col>
      <b-col sm="4"><AddEntry /></b-col>
    </b-row>
    
    <EntryList />
  </div>
</template>

<script>
import AddEntry from "./components/AddEntry.vue";
import FilterEntry from "./components/FilterEntry.vue";
import EntryList from "./components/EntryList.vue";

export default {
  name: "App",
  components: {
    AddEntry,
    FilterEntry,
    EntryList,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
#header {
  padding-left: 15px;
}
</style>
