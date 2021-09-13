<template>
  <div id= "filterEntry">
    <b-form-input 
      id="filter-input"
      v-model="filter"
      type="search"
      placeholder="Type to search by status"
    ></b-form-input>
  </div>
</template>

<script>
export default {
  setup() {},
};
</script>

<style scoped>
#filterEntry {
    padding-top: 20px;
    padding-bottom: 20px;
}
</style>