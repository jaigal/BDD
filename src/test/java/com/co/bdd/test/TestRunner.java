package com.co.bdd.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.picocontainer.PicoFactory;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/feature" }, glue = {
		"com.co.bdd.step" }, objectFactory = PicoFactory.class)
public class TestRunner {

}
