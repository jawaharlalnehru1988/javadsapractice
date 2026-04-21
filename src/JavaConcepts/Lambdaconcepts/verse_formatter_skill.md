# 📜 Skill: Verse Formatter

Follow these instructions strictly whenever formatting verses for the user.

## 🎨 Formatting Rule (The "4-Line Stanza" Rule)
Each verse typically has 4 lines of poetry.
- **Line 1**: Keep the `>` symbol at the beginning.
- **Lines 2, 3, and 4**: Remove the `>` symbol at the beginning.
- **Preserve Italicization**: Keep the `*` symbols at the start and end of each line of poetry.

## 💾 File Management Rules
- **DO NOT OVERWRITE**: Always check the existing file content before writing. Append new sets to the existing verses unless specifically told to reformat the whole file.
- **Encoding**: Use UTF-8 to ensure special characters like `ṛ`, `ṣ`, `ṇ`, and `ā` are preserved correctly.
- **Verification**: After writing, use `view_file` to confirm that the `>` symbols are only on the first line of each stanza.

## ✍️ Example
**Input from user:**
> *Line 1*
> *Line 2*
> *Line 3*
> *Line 4*

**Desired Output:**
> *Line 1*
*Line 2*
*Line 3*
*Line 4*
