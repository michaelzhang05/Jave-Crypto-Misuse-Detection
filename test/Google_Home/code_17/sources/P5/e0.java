package P5;

import a6.InterfaceC1668n;
import i6.AbstractC3000i;
import i6.AbstractC3001j;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class e0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f8867a;

        /* renamed from: b, reason: collision with root package name */
        Object f8868b;

        /* renamed from: c, reason: collision with root package name */
        int f8869c;

        /* renamed from: d, reason: collision with root package name */
        int f8870d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f8871e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8872f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f8873g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Iterator f8874h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f8875i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f8876j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, int i9, Iterator it, boolean z8, boolean z9, S5.d dVar) {
            super(2, dVar);
            this.f8872f = i8;
            this.f8873g = i9;
            this.f8874h = it;
            this.f8875i = z8;
            this.f8876j = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(this.f8872f, this.f8873g, this.f8874h, this.f8875i, this.f8876j, dVar);
            aVar.f8871e = obj;
            return aVar;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(AbstractC3000i abstractC3000i, S5.d dVar) {
            return ((a) create(abstractC3000i, dVar)).invokeSuspend(O5.I.f8278a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00ad  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0146 -> B:12:0x0149). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0118 -> B:30:0x011b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a2 -> B:50:0x0055). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: P5.e0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i8, int i9) {
        String str;
        if (i8 > 0 && i9 > 0) {
            return;
        }
        if (i8 != i9) {
            str = "Both size " + i8 + " and step " + i9 + " must be greater than zero.";
        } else {
            str = "size " + i8 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static final Iterator b(Iterator iterator, int i8, int i9, boolean z8, boolean z9) {
        AbstractC3255y.i(iterator, "iterator");
        if (!iterator.hasNext()) {
            return F.f8834a;
        }
        return AbstractC3001j.a(new a(i8, i9, iterator, z9, z8, null));
    }
}
