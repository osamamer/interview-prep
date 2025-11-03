from typing import List


class Solution:
    def maxArea(self, heights: List[int]) -> int:
        n = len(heights)
        l = 0
        r = n - 1
        max_water = 0
        while (l < r):
            length = r - l
            height = min(heights[l], heights[r])
            water = length * height
            max_water = max(water, max_water)

            if heights[l] > heights[r]:
                r -= 1
            else:
                l += 1

        return max_water


