<template>
  <div>
    <b-form-input
      id="filter-input"
      v-model="filter"
      type="search"
      placeholder="Type to search by status"
    ></b-form-input>


      <b-form-group
        label="Sort"
        label-for="sort-by-select"
        label-cols-sm="3"
        label-align-sm="right"
        label-size="sm"
        class="mb-0"
        v-slot="{ ariaDescribedby }"
      >
      <labelsad></label>
        <b-form-select
          id="sort-by-select"
          v-model="sortBy"
          :options="sortOptions"
          :aria-describedby="ariaDescribedby"
          size="l"
          class="w-75"
        >
          <template #first>
            <option value="">-- none --</option>
          </template>
        </b-form-select>
      </b-form-group>
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