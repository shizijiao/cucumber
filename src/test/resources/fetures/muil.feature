#language: zh-CN
功能: 测试计算器

  场景大纲: 测试各种方法
    假设 我 输入 "<num1>" 和 "<num2>"
    当 运行计算器的"<method>"法
    那么 输出的结果应当 "<num3>"
    例子:
      | num1 | num2 | method | num3 |
      | 2    | 3    | 加      | 5    |
      | 3    | 5    | 减     | 1    |