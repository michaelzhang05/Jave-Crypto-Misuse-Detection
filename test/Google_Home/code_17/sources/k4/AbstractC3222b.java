package k4;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: k4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3222b {

    /* renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f34119a = CompositionLocalKt.staticCompositionLocalOf(a.f34120a);

    /* renamed from: k4.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34120a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3221a invoke() {
            return C3223c.f34121a;
        }
    }

    public static final ProvidableCompositionLocal a() {
        return f34119a;
    }
}
