package e4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: e4.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2612h0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.h0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30694a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f30695b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30696c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30697d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Modifier modifier, int i8, int i9) {
            super(2);
            this.f30694a = str;
            this.f30695b = modifier;
            this.f30696c = i8;
            this.f30697d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC2612h0.a(this.f30694a, this.f30695b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f30696c | 1), this.f30697d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r1 = r27
            r0 = r30
            r15 = r31
            java.lang.String r2 = "text"
            kotlin.jvm.internal.AbstractC3159y.i(r1, r2)
            r2 = -1723562927(0xffffffff99448451, float:-1.01596836E-23)
            r3 = r29
            androidx.compose.runtime.Composer r13 = r3.startRestartGroup(r2)
            r3 = r15 & 1
            if (r3 == 0) goto L1b
            r3 = r0 | 6
            goto L2b
        L1b:
            r3 = r0 & 14
            if (r3 != 0) goto L2a
            boolean r3 = r13.changed(r1)
            if (r3 == 0) goto L27
            r3 = 4
            goto L28
        L27:
            r3 = 2
        L28:
            r3 = r3 | r0
            goto L2b
        L2a:
            r3 = r0
        L2b:
            r4 = r15 & 2
            if (r4 == 0) goto L35
            r3 = r3 | 48
        L31:
            r5 = r28
        L33:
            r6 = r3
            goto L48
        L35:
            r5 = r0 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L31
            r5 = r28
            boolean r6 = r13.changed(r5)
            if (r6 == 0) goto L44
            r6 = 32
            goto L46
        L44:
            r6 = 16
        L46:
            r3 = r3 | r6
            goto L33
        L48:
            r3 = r6 & 91
            r7 = 18
            if (r3 != r7) goto L5b
            boolean r3 = r13.getSkipping()
            if (r3 != 0) goto L55
            goto L5b
        L55:
            r13.skipToGroupEnd()
            r26 = r13
            goto Lb8
        L5b:
            if (r4 == 0) goto L62
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            r25 = r3
            goto L64
        L62:
            r25 = r5
        L64:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L70
            r3 = -1
            java.lang.String r4 = "com.stripe.android.ui.core.elements.H4Text (H4Text.kt:13)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r6, r3, r4)
        L70:
            androidx.compose.material.MaterialTheme r4 = androidx.compose.material.MaterialTheme.INSTANCE
            int r5 = androidx.compose.material.MaterialTheme.$stable
            androidx.compose.material.Colors r2 = r4.getColors(r13, r5)
            long r2 = r2.m1177getOnSurface0d7_KjU()
            androidx.compose.material.Typography r4 = r4.getTypography(r13, r5)
            androidx.compose.ui.text.TextStyle r20 = r4.getH4()
            r22 = r6 & 126(0x7e, float:1.77E-43)
            r23 = 0
            r24 = 65528(0xfff8, float:9.1824E-41)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r26 = r13
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r27
            r1 = r25
            r21 = r26
            androidx.compose.material.TextKt.m1414Text4IGK_g(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lb6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lb6:
            r5 = r25
        Lb8:
            androidx.compose.runtime.ScopeUpdateScope r0 = r26.endRestartGroup()
            if (r0 == 0) goto Lcc
            e4.h0$a r1 = new e4.h0$a
            r2 = r27
            r3 = r30
            r4 = r31
            r1.<init>(r2, r5, r3, r4)
            r0.updateScope(r1)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.AbstractC2612h0.a(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
