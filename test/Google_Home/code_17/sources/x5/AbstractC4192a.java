package x5;

import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC4192a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f40750a;

    /* renamed from: x5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC0928a {

        /* renamed from: a, reason: collision with root package name */
        final LinkedHashMap f40751a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0928a(int i8) {
            this.f40751a = b.b(i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0928a a(Object obj, i iVar) {
            this.f40751a.put(h.c(obj, LeanbackPreferenceDialogFragment.ARG_KEY), h.c(iVar, "provider"));
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4192a(Map map) {
        this.f40750a = DesugarCollections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map a() {
        return this.f40750a;
    }
}
