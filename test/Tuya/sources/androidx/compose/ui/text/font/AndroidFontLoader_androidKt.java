package androidx.compose.ui.text.font;

import L5.s;
import android.content.Context;
import androidx.core.content.res.ResourcesCompat;
import i6.C2839p;
import i6.InterfaceC2837o;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Typeface load(ResourceFont resourceFont, Context context) {
        android.graphics.Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        AbstractC3159y.f(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, P5.d dVar) {
        final C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        ResourcesCompat.getFont(context, resourceFont.getResId(), new ResourcesCompat.FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrievalFailed */
            public void lambda$callbackFailAsync$1(int i8) {
                InterfaceC2837o.this.v(new IllegalStateException("Unable to load font " + resourceFont + " (reason=" + i8 + ')'));
            }

            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            /* renamed from: onFontRetrieved */
            public void lambda$callbackSuccessAsync$0(android.graphics.Typeface typeface) {
                InterfaceC2837o.this.resumeWith(s.b(typeface));
            }
        }, null);
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }
}
