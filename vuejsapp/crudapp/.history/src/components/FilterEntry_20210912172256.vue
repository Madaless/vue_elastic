<template>
  <div>
    <b-row id="filterEntry">
      <b-col sm="10">
        <b-form-input
          id="filter-input"
          v-model="filter"
          type="search"
          placeholder="Type to search by status"
        ></b-form-input>
      </b-col>
      <b-col sm="2">
        <b-form-select
          id="sort-by-select"
          v-model="sortBy"
          :options="sortOptions"
          :aria-describedby="ariaDescribedby"
          class="w-75"
        >
          <template #first>
            <option value="">-- none --</option>
          </template>
        </b-form-select>
      </b-col>
    </b-row>
  </div>
</template>

<script>
export default {
  setup() {},
  data() {
    return {
      sortOptions: ["no", "yes"],
    };
  },
};
</script>

<style scoped>
</style>