package Y2;

import O5.I;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f13527a = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements InterfaceC1669o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1668n f13528a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1668n interfaceC1668n) {
            super(3);
            this.f13528a = interfaceC1668n;
        }

        public final void a(String it, Composer composer, int i8) {
            AbstractC3255y.i(it, "it");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-254047745, i8, -1, "com.stripe.android.link.utils.InlineContentTemplateBuilder.add.<anonymous> (InlineContentTemplateBuilder.kt:30)");
            }
            this.f13528a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // a6.InterfaceC1669o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((String) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f8278a;
        }
    }

    public static /* synthetic */ b b(b bVar, String str, long j8, long j9, int i8, InterfaceC1668n interfaceC1668n, int i9, Object obj) {
        int i10;
        if ((i9 & 8) != 0) {
            i10 = PlaceholderVerticalAlign.Companion.m4630getCenterJ6kI3mc();
        } else {
            i10 = i8;
        }
        return bVar.a(str, j8, j9, i10, interfaceC1668n);
    }

    public static /* synthetic */ b d(b bVar, String str, long j8, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = PlaceholderVerticalAlign.Companion.m4630getCenterJ6kI3mc();
        }
        return bVar.c(str, j8, i8);
    }

    public final b a(String id, long j8, long j9, int i8, InterfaceC1668n content) {
        AbstractC3255y.i(id, "id");
        AbstractC3255y.i(content, "content");
        this.f13527a.put(id, new InlineTextContent(new Placeholder(j8, j9, i8, null), ComposableLambdaKt.composableLambdaInstance(-254047745, true, new a(content))));
        return this;
    }

    public final b c(String id, long j8, int i8) {
        AbstractC3255y.i(id, "id");
        a(id, j8, TextUnitKt.getEm(0), i8, Y2.a.f13524a.a());
        return this;
    }

    public final Map e() {
        return this.f13527a;
    }
}
