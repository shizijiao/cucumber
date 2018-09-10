Feature: 使用 ATM 固定金额方式取款
  通常“取款”菜单包含了几个固定金额，使用这些固定金额取款可以避免从键盘输入提取金额，从而可以加速交易，提高取款的效率2。

  Scenario Outline: 固定金额取款
    Given 我的账户中有余额"<accountBalance>"元
    When 我选择固定金额取款方式取出"<withdrawAmount>"元
    Then 我应该收到现金"<receivedAmount>"元
    And 我账户的余额应该是"<remainingBalance>"元
    Examples:
      | accountBalance | withdrawAmount | receivedAmount | remainingBalance |
      | 1000.00        | 100.00         | 100.00         | 900.00           |
      | 500.00         | 500.00         | 500.00         | 0.00             |