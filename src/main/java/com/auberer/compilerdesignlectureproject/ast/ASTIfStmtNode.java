package com.auberer.compilerdesignlectureproject.ast;

import com.auberer.compilerdesignlectureproject.lexer.TokenType;

import java.util.Set;

public class ASTIfStmtNode extends ASTNode {
  @Override
  public <T> T accept(ASTVisitor<T> visitor) {
    return visitor.visitIfStmt(this);
  }

  public static Set<TokenType> getSelectionSet() {
    return Set.of(TokenType.TOK_IF);
  }

  public ASTTernaryExprNode getCondition() {
    return getChild(ASTTernaryExprNode.class, 0);
  }

  public ASTIfBodyNode getIfBody() {
    return getChild(ASTIfBodyNode.class, 0);
  }

  public ASTElseStmtNode getElseStmt() {
    return getChild(ASTElseStmtNode.class, 0);
  }
}
