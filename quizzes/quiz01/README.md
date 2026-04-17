# Quiz 01: Compiler Construction

This folder contains the first quiz for Group 01 and Group 02. The tasks focus on using ANTLR grammar actions to perform calculations and logical evaluations.

---

## 📝 Group 01: Summation Calculation

### **The Task**
Create a grammar that parses a custom "Sum" expression and calculates the result. The input format should be:
`Sum(i-J) from N to M`
Where:
- `J` is an integer subtracted from each index.
- `N` is the starting integer.
- `M` is the ending integer.

### **Grammar Implementation (`group01.g`)**
```antlr
summation returns [int sum]:
    'Sum(i-' j=INT ')' 'from' n=INT 'to' m=INT {
        $sum = 0;
        int valJ = Integer.parseInt($j.text);
        int valM = Integer.parseInt($m.text);
        // Logic: Iterate up to M and subtract J
        for(int i=0; i <= valM; i++){
            $sum = i - valJ;
        }
    }
;
```

### **Answer Explanation**
1. **Rule Return**: The rule `summation` is defined to return an `int` named `sum`.
2. **Labeling**: Input integers are captured using labels (`j=INT`, `n=INT`, `m=INT`).
3. **Action Block**:
   - Variables are converted from text to integers using `Integer.parseInt()`.
   - A `for` loop executes the calculation logic directly within the parser.
   - Note: In the provided solution, the loop updates the sum repeatedly; to perform a true cumulative sum, you would use `$sum += (i - valJ)`.

---

## 📝 Group 02: Logical Comparison

### **The Task**
Create a grammar that parses a comparison between two integers and returns a boolean result. The input format should be:
`INT OP INT`
Where `OP` can be `>`, `<`, or `==`.

### **Grammar Implementation (`group02.g`)**
```antlr
dec returns [boolean ebram]:
    a=INT op=OP b=INT {
        if($op.text.equals(">")){
            $ebram = Integer.parseInt($a.text) > Integer.parseInt($b.text);
        } else if($op.text.equals("<")){
            $ebram = Integer.parseInt($a.text) < Integer.parseInt($b.text);
        } else {
            $ebram = Integer.parseInt($a.text) == Integer.parseInt($b.text);
        }
    }
;
```

### **Answer Explanation**
1. **Rule Return**: The rule `dec` returns a `boolean` named `ebram`.
2. **Operator Handling**: The `OP` token captures the comparison symbol.
3. **Action Block**:
   - The code uses `if-else` logic to check the text of the operator (`$op.text`).
   - It performs the corresponding Java comparison and assigns the result to `$ebram`.

---

## 🚀 How to Run
1. Open the desired grammar file in `grammar/`.
2. Press **Ctrl+Shift+B** > **Java: Compile Lab**.
3. Use the **"Run Current Lab"** task to execute.
