<template>
  <div>
    <b-form-input
      id="filter-input"
      v-model="filter"
      type="search"
      placeholder="Type to search by status"
    ></b-form-input>

    <b-form-select
      id="initial-sort-select"
      v-model="sortDirection"
      :options="['asc', 'desc', 'last']"
      size="sm"
    ></b-form-select>
  </div>
</template>

<script>
export default {
  setup() {},
};
</script>

<style scoped>
</style>