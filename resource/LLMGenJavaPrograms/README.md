# LLMGenJavaPrograms

LLM-reproduced Java solutions for Task 1.1, i.e. the code that DeepSeek-v4 Instant
Chat generated from the finalized `Task-1/{problem_id}/summary.txt` and that was
submitted to LeetCode.

Layout mirrors `resource/correctJavaPrograms`: `{problem_id}/Solution.java`.
The files are verbatim copies of the code blocks in the DeepSeek answers; they are
not edited, reformatted (beyond trailing whitespace), or completed.

| Problem ID | Source (code-generation chat) | LeetCode submission | Extracted |
| --- | --- | --- | --- |
| `minimum-swaps-to-sort-by-digit-sum` | https://chat.deepseek.com/share/2rkliex5mjus469pok | https://leetcode.com/problems/minimum-swaps-to-sort-by-digit-sum/submissions/2137509165 | 2026-09-10 |
| `count-covered-buildings` | https://chat.deepseek.com/share/9niz4j78837nrzodys | https://leetcode.com/problems/count-covered-buildings/submissions/2137515814 | 2026-09-10 |
| `shortest-matching-substring` | https://chat.deepseek.com/share/wln20orfyymkx4jrth | https://leetcode.com/problems/shortest-matching-substring/submissions/2137522784 | 2026-09-10 |
| `minimum-moves-to-clean-the-classroom` | https://chat.deepseek.com/share/xpnr488grbbt9wsj1t | https://leetcode.com/problems/minimum-moves-to-clean-the-classroom/submissions/2137528996 | 2026-09-10 |

Note: the `shortest-matching-substring` reply contains two Java blocks. The submitted
one is the **first** block (the version written inside the answer, with `int best`,
`(lo + hi) / 2`, `if (pat.isEmpty()) return res;` and the comment
`// parts should have length 3: a, b, c`); it was confirmed against the LeetCode
submission page on 2026-09-11 and is the file stored here. The reply's second block is
an equivalent clean-up (`ans`, `(lo + hi) >>> 1`, `if (m == 0 || m > n)` guard) and is
kept only as an alternative in `Process/Task-1/LLMGenCode/candidates/shortest-matching-substring/block-2.java`.
`Process/_tools/fetch_llm_code.py` pins this choice via `BLOCK_OVERRIDE` so a re-run
reproduces the same file.

Raw share payloads (unmodified API responses) are kept as evidence in
`Process/Task-1/LLMGenCode/raw/`. The extraction is reproducible with
`python Process/_tools/fetch_llm_code.py`.
