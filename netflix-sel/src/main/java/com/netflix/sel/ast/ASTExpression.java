/* Generated By:JJTree: Do not edit this line. ASTExpression.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.netflix.sel.ast;

import com.netflix.sel.visitor.SelBaseNode;

public class ASTExpression extends SelBaseNode {
  public ASTExpression(int id) {
    super(id);
  }

  public ASTExpression(SelParser p, int id) {
    super(p, id);
  }

  /** Accept the visitor. * */
  public Object jjtAccept(SelParserVisitor visitor, Object data) {

    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=690d1af33d20d8a305fd0d097cb157d0 (do not edit this line) */