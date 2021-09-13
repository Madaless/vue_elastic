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
    padding-left: 20px;
    padding-right: 20px;
}
</style>