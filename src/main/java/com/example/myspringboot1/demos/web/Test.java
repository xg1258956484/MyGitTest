package com.example.myspringboot1.demos.web;

import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.LinkedList;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class Test {


//    public static void execAfterTransactionCommit(Action0 action) {
//        if (action == null) {
//            return;
//        }
//
//        if (TransactionSynchronizationManager.isActualTransactionActive() && TransactionSynchronizationManager.isSynchronizationActive()) {
////            if (!isTransactionCommitted()) {
////                log.info("当前事务未提交，注册 registerAfterCommittedAction，action指针:{}", action);
//                registerAfterCommittedAction(action);
//            } else {
//                log.info("当前事务已提交，注册 registerAfterCompletionAction，action指针:{}", action);
//                registerAfterCompletionAction(action);
//            }
//        } else {
//            log.info("当前无事务，立刻执行，action指针:{}", action);
//            action.apply();
//        }
//    }
//
//    private static boolean isTransactionCommitted() {
//        return TransactionSynchronizationManager.getSynchronizations().stream()
//                .anyMatch(i -> i instanceof AcctAfterCommitTransactionSynchronization
//                        && ((AcctAfterCommitTransactionSynchronization) i).isCommitted);
//    }
//
//    private static void registerAfterCommittedAction(Action0 action) {
//
//        TransactionSynchronizationManager.registerSynchronization(new AcctAfterCommitTransactionSynchronization(action));
//    }
//
//    private static void registerAfterCompletionAction(Action0 action) {
//        AcctAfterCompletionTransactionSynchronization afterCompletionTransactionSynchronization =
//                (AcctAfterCompletionTransactionSynchronization)TransactionSynchronizationManager.getSynchronizations().stream()
//                        .filter(i -> i instanceof AcctAfterCompletionTransactionSynchronization).findFirst().orElse(null);
//
//        if(afterCompletionTransactionSynchronization == null) {
//            afterCompletionTransactionSynchronization = new AcctAfterCompletionTransactionSynchronization();
//            TransactionSynchronizationManager.registerSynchronization(afterCompletionTransactionSynchronization);
//        }
//        afterCompletionTransactionSynchronization.actions.add(action);
//    }
//
//    public static class AcctAfterCommitTransactionSynchronization implements TransactionSynchronization {
//
//        private final Action0 action;
//
//        private boolean isCommitted = false;
//
//        public AcctAfterCommitTransactionSynchronization(Action0 action) {
//            this.action = action;
//        }
//
//        @Override
//        public void afterCommit() {
//            this.isCommitted = true;
//            if(action != null) {
//                log.info("afterCommit，执行 AcctAfterCommitTransactionSynchronization，action指针:{}", action);
//                action.apply();
//            }
//        }
//    }
//
//    public static class AcctAfterCompletionTransactionSynchronization implements TransactionSynchronization {
//
//        private final List<Action0> actions = new LinkedList<>();
//
//        public AcctAfterCompletionTransactionSynchronization() {
//        }
//
//        @Override
//        public void afterCompletion(int status) {
//            if(TransactionSynchronization.STATUS_COMMITTED != status) {
//                return;
//            }
//            // 执行afterCommit执行过程中新注册的任务
//            log.info("afterCompletion, 执行AcctAfterCommitTransactionSynchronization");
//            actions.forEach(action -> {
//                log.info("顺序执行，action指针:{}", action);
//                action.apply();
//            });
//        }
//    }
}
