package com.faas;

import org.jeasy.rules.api.Action;
import org.jeasy.rules.api.Condition;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.core.RuleBuilder;

public class EasyRulesTest {

    public static void main(String[] args) {

        Rule testRule = new RuleBuilder()
                                .description("测试规则")
                                .priority(1)
                                .name("testRule")
                                .when(new Condition() {
                                    @Override
                                    public boolean evaluate(Facts facts) {
                                        facts.asMap();
                                        return false;
                                    }
                                })
                                .then(new Action() {
                                    @Override
                                    public void execute(Facts facts) throws Exception {

                                    }
                                })
                                .build();
    }
}
