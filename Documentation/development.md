# Development
Feel free to contribute! Also feel free to open any issues on [github](https://github.com/Jetison333/SPADE) with bugs or feature requests.


## antlr
If you need to edit the grammar inside of coll.g4 file, use the following commands (you will need to install antlr4):

antlr commands should be done inside of grammar/
to test grammer rules, use

```bash
antlr4-parse coll.g4 start -gui
```

To regenerate the antlr code after editing coll.g4 use
```bash
antlr4 coll.g4
```