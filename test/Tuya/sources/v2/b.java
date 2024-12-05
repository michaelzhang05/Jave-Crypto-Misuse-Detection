package V2;

import L5.I;
import X5.n;
import X5.o;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f11889a = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f11890a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n nVar) {
            super(3);
            this.f11890a = nVar;
        }

        public final void a(String it, Composer composer, int i8) {
            AbstractC3159y.i(it, "it");
            if ((i8 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-254047745, i8, -1, "com.stripe.android.link.utils.InlineContentTemplateBuilder.add.<anonymous> (InlineContentTemplateBuilder.kt:30)");
            }
            this.f11890a.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // X5.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((String) obj, (Composer) obj2, ((Number) obj3).intValue());
            return I.f6487a;
        }
    }

    public static /* synthetic */ b b(b bVar, String str, long j8, long j9, int i8, n nVar, int i9, Object obj) {
        int i10;
        if ((i9 & 8) != 0) {
            i10 = PlaceholderVerticalAlign.Companion.m4625getCenterJ6kI3mc();
        } else {
            i10 = i8;
        }
        return bVar.a(str, j8, j9, i10, nVar);
    }

    public static /* synthetic */ b d(b bVar, String str, long j8, int i8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            i8 = PlaceholderVerticalAlign.Companion.m4625getCenterJ6kI3mc();
        }
        return bVar.c(str, j8, i8);
    }

    public final b a(String id, long j8, long j9, int i8, n content) {
        AbstractC3159y.i(id, "id");
        AbstractC3159y.i(content, "content");
        this.f11889a.put(id, new InlineTextContent(new Placeholder(j8, j9, i8, null), ComposableLambdaKt.composableLambdaInstance(-254047745, true, new a(content))));
        return this;
    }

    public final b c(String id, long j8, int i8) {
        AbstractC3159y.i(id, "id");
        a(id, j8, TextUnitKt.getEm(0), i8, V2.a.f11886a.a());
        return this;
    }

    public final Map e() {
        return this.f11889a;
    }
}
