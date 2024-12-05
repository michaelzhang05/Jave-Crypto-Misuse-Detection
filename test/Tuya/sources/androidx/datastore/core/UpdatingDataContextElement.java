package androidx.datastore.core;

import P5.g;
import X5.n;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

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

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public UpdatingDataContextElement(UpdatingDataContextElement updatingDataContextElement, DataStoreImpl<?> instance) {
        AbstractC3159y.i(instance, "instance");
        this.parent = updatingDataContextElement;
        this.instance = instance;
    }

    public final void checkNotUpdating(DataStore<?> candidate) {
        AbstractC3159y.i(candidate, "candidate");
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

    @Override // P5.g.b, P5.g
    public <R> R fold(R r8, n nVar) {
        return (R) g.b.a.a(this, r8, nVar);
    }

    @Override // P5.g.b, P5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // P5.g.b
    public g.c getKey() {
        return Companion.Key.INSTANCE;
    }

    @Override // P5.g.b, P5.g
    public g minusKey(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // P5.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
