package androidx.compose.runtime.collection;

import L5.I;
import P5.d;
import X5.n;
import f6.AbstractC2682i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;

@f(c = "androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$keys$1$iterator$1", f = "IdentityArrayMap.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class IdentityArrayMap$asMap$1$keys$1$iterator$1 extends k implements n {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IdentityArrayMap<Key, Value> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityArrayMap$asMap$1$keys$1$iterator$1(IdentityArrayMap<Key, Value> identityArrayMap, d dVar) {
        super(2, dVar);
        this.this$0 = identityArrayMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        IdentityArrayMap$asMap$1$keys$1$iterator$1 identityArrayMap$asMap$1$keys$1$iterator$1 = new IdentityArrayMap$asMap$1$keys$1$iterator$1(this.this$0, dVar);
        identityArrayMap$asMap$1$keys$1$iterator$1.L$0 = obj;
        return identityArrayMap$asMap$1$keys$1$iterator$1;
    }

    @Override // X5.n
    public final Object invoke(AbstractC2682i abstractC2682i, d dVar) {
        return ((IdentityArrayMap$asMap$1$keys$1$iterator$1) create(abstractC2682i, dVar)).invokeSuspend(I.f6487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0049 -> B:5:0x004c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = Q5.b.e()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            int r1 = r6.I$1
            int r3 = r6.I$0
            java.lang.Object r4 = r6.L$0
            f6.i r4 = (f6.AbstractC2682i) r4
            L5.t.b(r7)
            goto L4c
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            L5.t.b(r7)
            java.lang.Object r7 = r6.L$0
            f6.i r7 = (f6.AbstractC2682i) r7
            androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> r1 = r6.this$0
            int r1 = r1.getSize()
            r3 = 0
            r4 = r7
        L2e:
            if (r3 >= r1) goto L4e
            androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> r7 = r6.this$0
            java.lang.Object[] r7 = r7.getKeys()
            r7 = r7[r3]
            java.lang.String r5 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
            kotlin.jvm.internal.AbstractC3159y.g(r7, r5)
            r6.L$0 = r4
            r6.I$0 = r3
            r6.I$1 = r1
            r6.label = r2
            java.lang.Object r7 = r4.c(r7, r6)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            int r3 = r3 + r2
            goto L2e
        L4e:
            L5.I r7 = L5.I.f6487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$keys$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
