<template>
  <div>
    <b-form-input id= "filterEntry"
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
    padding-left: 10px;
    padding-right: 10px;
}
</style>