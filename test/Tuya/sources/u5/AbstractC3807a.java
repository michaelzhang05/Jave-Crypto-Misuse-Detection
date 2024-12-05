package u5;

import androidx.leanback.preference.LeanbackPreferenceDialogFragment;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: u5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC3807a implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f38566a;

    /* renamed from: u5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC0890a {

        /* renamed from: a, reason: collision with root package name */
        final LinkedHashMap f38567a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0890a(int i8) {
            this.f38567a = b.b(i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0890a a(Object obj, i iVar) {
            this.f38567a.put(h.c(obj, LeanbackPreferenceDialogFragment.ARG_KEY), h.c(iVar, "provider"));
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3807a(Map map) {
        this.f38566a = DesugarCollections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map a() {
        return this.f38566a;
    }
}
