
# Sentence Validator <img align="right" height="40" src="https://cdn.shortpixel.ai/client/q_glossy,ret_img,w_228,h_73/http://ftt.com.br/home/wp-content/uploads/2019/10/logo.png">

this project solves the `The Balanced Parentheses Problem - Classic Stack Problem ("Valid Parentheses" on Leetcode)` considering the language `<{[()]}>`, proposed by [Daniel Carvalho](https://github.com/danielscarvalho) in the compilers subject at *FTT*.

## Requirements:

  - This project was built on Java with Visual Code using OpenJDK 11, just run the App.java to use it.

The expected output is:
            -> Validated word: [](){}
            Valid
            -> Validated word: [)]{}
            Invalid
            -> Validated word: [(]){}<>
            Invalid
            -> Validated word: (((((([]))))))
            Valid
            -> Validated word: {{[[()]()]}}
            Valid
            -> Validated word: {[[([)]]]}
            Invalid
            -> Validated word: <{(())}>
            Valid
            -> Validated word: {<[]()[[]]<>>}
            Valid
            Type a sentence to validate. Sample: <{[()]}>
