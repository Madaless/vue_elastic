<template>
  <div id="app">
    <AddEntry/>
    <FilterEntry/>
    <EntryList/>
  </div>
</template>

<script>
import AddEntry from './components/AddEntry.vue'
import FilterEntry from './components/AddEntry.vue'
import EntryList from './components/AddEntry.vue'


export default {
  name: 'App',
  components: {
    AddEntry,
    FilterEntry,
    EntryList
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
