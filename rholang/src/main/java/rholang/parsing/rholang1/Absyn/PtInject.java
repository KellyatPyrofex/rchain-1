package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class PtInject extends Pattern {
  public final Pattern pattern_;
  public PtInject(Pattern p1) { pattern_ = p1; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.Pattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.PtInject) {
      rholang.parsing.rholang1.Absyn.PtInject x = (rholang.parsing.rholang1.Absyn.PtInject)o;
      return this.pattern_.equals(x.pattern_);
    }
    return false;
  }

  public int hashCode() {
    return this.pattern_.hashCode();
  }


}
