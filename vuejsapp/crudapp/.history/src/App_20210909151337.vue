<template>
  <div id="app">
     <b-navbar class="navbar navbar-expand navbar-dark bg-dark">
      <router-link to="/" class="navbar-brand">REKRUTACJA APP</router-link>
      <!-- <div class="navbar-nav mr-auto">
        <li class="nav-item">
          <router-link to="/tutorials" class="nav-link">Tutorials</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/add" class="nav-link">Add</router-link>
        </li>
      </div> -->
    </nav>
    <AddEntry/>
    <FilterEntry/>
    <EntryList/>
  </div>
</template>

<script>
import AddEntry from './components/AddEntry.vue'
import FilterEntry from './components/FilterEntry.vue'
import EntryList from './components/EntryList.vue'


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
}
</style>
