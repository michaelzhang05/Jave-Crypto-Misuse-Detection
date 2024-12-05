package androidx.compose.ui.text.font;

import O5.s;
import android.content.Context;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3374p;
import l6.InterfaceC3372o;

/* loaded from: classes.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Typeface load(ResourceFont resourceFont, Context context) {
        android.graphics.Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        AbstractC3255y.f(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, S5.d dVar) {
        final C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        ResourcesCompat.getFont(context, resourceFont.getResId(), new ResourcesCompat.FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrievalFailed */
            public void lambda$callbackFailAsync$1(int i8) {
                InterfaceC3372o.this.t(new IllegalStateException("Unable to load font " + resourceFont + " (reason=" + i8 + ')'));
            }

            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrieved */
            public void lambda$callbackSuccessAsync$0(android.graphics.Typeface typeface) {
                InterfaceC3372o.this.resumeWith(s.b(typeface));
            }
        }, null);
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }
}
