package androidx.datastore.core;

import S5.g;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class UpdatingDataContextElement implements g.b {
    public static final Companion Companion = new Companion(null);
    private static final String NESTED_UPDATE_ERROR_MESSAGE = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    private final DataStoreImpl<?> instance;
    private final UpdatingDataContextElement parent;

    /* loaded from: classes3.dex */
    public static final class Companion {

        /* loaded from: classes3.dex */
        public static final class Key implements g.c {
            public static final Key INSTANCE = new Key();

            private Key() {
            }
        }

        private Companion() {
        }

        public final String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core_release() {
            return UpdatingDataContextElement.NESTED_UPDATE_ERROR_MESSAGE;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public UpdatingDataContextElement(UpdatingDataContextElement updatingDataContextElement, DataStoreImpl<?> instance) {
        AbstractC3255y.i(instance, "instance");
        this.parent = updatingDataContextElement;
        this.instance = instance;
    }

    public final void checkNotUpdating(DataStore<?> candidate) {
        AbstractC3255y.i(candidate, "candidate");
        if (this.instance != candidate) {
            UpdatingDataContextElement updatingDataContextElement = this.parent;
            if (updatingDataContextElement != null) {
                updatingDataContextElement.checkNotUpdating(candidate);
                return;
            }
            return;
        }
        throw new IllegalStateException(NESTED_UPDATE_ERROR_MESSAGE.toString());
    }

    @Override // S5.g.b, S5.g
    public <R> R fold(R r8, InterfaceC1668n interfaceC1668n) {
        return (R) g.b.a.a(this, r8, interfaceC1668n);
    }

    @Override // S5.g.b, S5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // S5.g.b
    public g.c getKey() {
        return Companion.Key.INSTANCE;
    }

    @Override // S5.g.b, S5.g
    public g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // S5.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
