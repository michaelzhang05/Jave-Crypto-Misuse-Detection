package kotlin.reflect.x.internal.l0.h;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.text.u;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes2.dex */
public enum m {
    PLAIN { // from class: kotlin.f0.x.e.l0.h.m.b
        @Override // kotlin.reflect.x.internal.l0.h.m
        public String f(String str) {
            l.f(str, "string");
            return str;
        }
    },
    HTML { // from class: kotlin.f0.x.e.l0.h.m.a
        @Override // kotlin.reflect.x.internal.l0.h.m
        public String f(String str) {
            String w;
            String w2;
            l.f(str, "string");
            w = u.w(str, "<", "&lt;", false, 4, null);
            w2 = u.w(w, ">", "&gt;", false, 4, null);
            return w2;
        }
    };

    /* synthetic */ m(g gVar) {
        this();
    }

    public abstract String f(String str);
}
