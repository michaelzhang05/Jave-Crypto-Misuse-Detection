package M3;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: M3.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1323s {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M3.s$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f7077b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7078c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7079d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Modifier modifier, int i8, int i9) {
            super(2);
            this.f7076a = str;
            this.f7077b = modifier;
            this.f7078c = i8;
            this.f7079d = i9;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(Composer composer, int i8) {
            AbstractC1323s.a(this.f7076a, this.f7077b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7078c | 1), this.f7079d);
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
        throw new UnsupportedOperationException("Method not decompiled: M3.AbstractC1323s.a(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final long b(TextStyle textStyle, int i8) {
        if (TextUnit.m5373isSpimpl(textStyle.m4728getFontSizeXSAIIZE())) {
            return TextUnitKt.getSp(TextUnit.m5370getValueimpl(textStyle.m4728getFontSizeXSAIIZE()) + i8);
        }
        return textStyle.m4728getFontSizeXSAIIZE();
    }
}
