package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class v1 extends kotlinx.coroutines.internal.j implements g1 {
    @Override // kotlinx.coroutines.g1
    public boolean b() {
        return true;
    }

    @Override // kotlinx.coroutines.g1
    public v1 e() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.l
    public String toString() {
        return l0.c() ? v("Active") : super.toString();
    }

    public final String v(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) m(); !kotlin.jvm.internal.l.a(lVar, this); lVar = lVar.o()) {
            if (lVar instanceof q1) {
                q1 q1Var = (q1) lVar;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(q1Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
