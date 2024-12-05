package J3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: J3.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1210s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J3.s$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5370a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f5371b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5372c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5373d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Modifier modifier, int i8, int i9) {
            super(2);
            this.f5370a = str;
            this.f5371b = modifier;
            this.f5372c = i8;
            this.f5373d = i9;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1210s.a(this.f5370a, this.f5371b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5372c | 1), this.f5373d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r49, androidx.compose.ui.Modifier r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.AbstractC1210s.a(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final long b(TextStyle textStyle, int i8) {
        if (TextUnit.m5368isSpimpl(textStyle.m4723getFontSizeXSAIIZE())) {
            return TextUnitKt.getSp(TextUnit.m5365getValueimpl(textStyle.m4723getFontSizeXSAIIZE()) + i8);
        }
        return textStyle.m4723getFontSizeXSAIIZE();
    }
}
