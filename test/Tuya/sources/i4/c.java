package I4;

import J4.i;
import L5.I;
import L5.t;
import N4.f;
import P5.d;
import X5.n;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.documentfile.provider.DocumentFile;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import i6.N;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final DocumentFile f4269a;

    /* renamed from: b, reason: collision with root package name */
    private final File f4270b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4271c;

    /* renamed from: d, reason: collision with root package name */
    private final i f4272d;

    /* loaded from: classes4.dex */
    static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f4273a;

        a(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f4273a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar = c.this;
                this.f4273a = 1;
                if (cVar.f(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f4275a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4277a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f4278b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f4279c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, ArrayList arrayList, d dVar) {
                super(2, dVar);
                this.f4278b = cVar;
                this.f4279c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f4278b, this.f4279c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f4277a == 0) {
                    t.b(obj);
                    this.f4278b.f4272d.a(this.f4279c);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: I4.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0070b extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f4280a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f4281b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f4282c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0070b(c cVar, ArrayList arrayList, d dVar) {
                super(2, dVar);
                this.f4281b = cVar;
                this.f4282c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0070b(this.f4281b, this.f4282c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, d dVar) {
                return ((C0070b) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f4280a == 0) {
                    t.b(obj);
                    this.f4281b.f4272d.b(this.f4282c);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f4275a;
            try {
                if (i8 != 0) {
                    if (i8 == 1 || i8 == 2) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    int i9 = 0;
                    if (c.this.f4269a != null) {
                        DocumentFile[] listFiles = c.this.f4269a.listFiles();
                        AbstractC3159y.h(listFiles, "currentDirectory.listFiles()");
                        ArrayList arrayList = new ArrayList();
                        int length = listFiles.length;
                        while (i9 < length) {
                            DocumentFile documentFile = listFiles[i9];
                            if (documentFile.getName() != null) {
                                arrayList.add(documentFile);
                                String path = documentFile.getUri().getPath();
                                if (path != null) {
                                    c cVar = c.this;
                                    String name = documentFile.getName();
                                    AbstractC3159y.f(name);
                                    cVar.g(path, name);
                                }
                            }
                            i9++;
                        }
                        J0 c8 = C2812b0.c();
                        a aVar = new a(c.this, arrayList, null);
                        this.f4275a = 1;
                        if (AbstractC2825i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    } else if (c.this.f4270b != null) {
                        File[] listFiles2 = c.this.f4270b.listFiles();
                        ArrayList arrayList2 = new ArrayList();
                        if (listFiles2 != null) {
                            int length2 = listFiles2.length;
                            while (i9 < length2) {
                                File file = listFiles2[i9];
                                arrayList2.add(file);
                                c cVar2 = c.this;
                                String path2 = file.getPath();
                                AbstractC3159y.h(path2, "file.path");
                                String name2 = file.getName();
                                AbstractC3159y.h(name2, "file.name");
                                cVar2.g(path2, name2);
                                i9++;
                            }
                        }
                        J0 c9 = C2812b0.c();
                        C0070b c0070b = new C0070b(c.this, arrayList2, null);
                        this.f4275a = 2;
                        if (AbstractC2825i.g(c9, c0070b, this) == e8) {
                            return e8;
                        }
                    }
                }
            } catch (Error e9) {
                e9.printStackTrace();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return I.f6487a;
        }
    }

    public c(DocumentFile documentFile, File file, Context context, i listener) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(listener, "listener");
        this.f4269a = documentFile;
        this.f4270b = file;
        this.f4271c = context;
        this.f4272d = listener;
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new b(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str, String str2) {
        Drawable h8;
        if (g6.n.r(str2, ".apk", false, 2, null)) {
            N4.t tVar = N4.t.f7270a;
            if (!tVar.a().containsKey(str2) && (h8 = new f().h(this.f4271c, str)) != null) {
                tVar.a().put(str2, h8);
            }
        }
    }
}
