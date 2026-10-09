import java.util.Scanner;

public class Bank {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long balance = 0;

            System.out.println("\n====== Welcome to Bank! ======\n");

            while(true) {
                System.out.println("业务编号:\n1.存款" + " 2.取款" + " 3.查询余额" + " 4.退出");
                System.out.print("请选择业务编号：");
                int choice = sc.nextInt();

                switch (choice){
                    case 1: //存款
                        System.out.print("请输入存款金额（大于0整数）：");
                        long deposit = sc.nextLong();
                        while (deposit<0){
                            System.out.print("存款金额不能小于0，请重新输入：");
                            deposit = sc.nextLong();
                        }
                        balance = balance + deposit;
                        System.out.println("存款成功，当前余额为 "+ balance + " 元\n");
                        break;

                    case 2: //取款
                        System.out.print("请输入取款金额（大于0整数）：");
                        long withdraw = sc.nextLong();

                        while (withdraw > balance){
                            System.out.print("余额不足，当前余额为 " +balance+ " 元，请重新输入：");
                            withdraw = sc.nextLong();
                            while (withdraw<0){
                                System.out.print("取款金额不能小于0，请重新输入：");
                                withdraw = sc.nextLong();
                            }
                        }
                        while (withdraw<0){
                            System.out.print("取款金额不能小于0，请重新输入：");
                            withdraw = sc.nextLong();
                            while (withdraw > balance) {
                                System.out.print("余额不足，当前余额为 " + balance + " 元，请重新输入：");
                                withdraw = sc.nextLong();
                            }
                        }
                            balance = balance - withdraw;
                            System.out.println("取款成功，当前余额为 "+ balance + " 元\n" );
                        break;

                    case 3: //查询余额
                        System.out.println("当前余额为 "+ balance + " 元\n");
                        break;

                    case 4: //退出
                        System.out.println("谢谢使用!");
                        sc.close();
                        return;

                    default:
                        System.out.println("无效选项，请输入 1-4 ！\n");
                }
            }
        }
    }

//主函数/类
//   命名输入器，原始变量为0
//   欢迎提示
//         while循环主菜单
//             键入业务编号，赋值给int
//             Switch
//               1 计算 输出语句
//               2 计算 输出语句 while
//               3 输出语句
//               4 关闭输入器，结束进程
//               default
//
//
