package com.uptodown.activities;

import G4.C1208s;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.S;
import a5.C1641h;
import a6.InterfaceC1668n;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.snackbar.Snackbar;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.NotificationsRegistryActivity;
import com.uptodown.activities.n;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.AbstractC3685y;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class NotificationsRegistryActivity extends AbstractActivityC2683a {

    /* renamed from: P, reason: collision with root package name */
    private boolean f29701P;

    /* renamed from: R, reason: collision with root package name */
    private C1208s f29703R;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29699N = O5.l.b(new a());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f29700O = new ViewModelLazy(U.b(n.class), new g(this), new f(this), new h(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private boolean f29702Q = true;

    /* renamed from: S, reason: collision with root package name */
    private d f29704S = new d();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S invoke() {
            return S.c(NotificationsRegistryActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f29706a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ NotificationsRegistryActivity f29707b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29708c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f29709a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ NotificationsRegistryActivity f29710b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f29711c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NotificationsRegistryActivity notificationsRegistryActivity, int i8, S5.d dVar) {
                super(2, dVar);
                this.f29710b = notificationsRegistryActivity;
                this.f29711c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f29710b, this.f29711c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f29709a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    NotificationsRegistryActivity notificationsRegistryActivity = this.f29710b;
                    int i9 = this.f29711c;
                    this.f29709a = 1;
                    if (notificationsRegistryActivity.w3(i9, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, NotificationsRegistryActivity notificationsRegistryActivity, int i8) {
            super(0);
            this.f29706a = file;
            this.f29707b = notificationsRegistryActivity;
            this.f29708c = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5573invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5573invoke() {
            if (this.f29706a.delete()) {
                Snackbar.make(this.f29707b.n3().f11977c, this.f29707b.getString(R.string.snackbar_message_apk_deleted, this.f29706a.getName()), -1).show();
                AbstractC3364k.d(N.a(C3347b0.b()), null, null, new a(this.f29707b, this.f29708c, null), 3, null);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Z4.r {
        c() {
        }

        @Override // Z4.r
        public void c(int i8) {
            Snackbar.make(NotificationsRegistryActivity.this.n3().f11977c, R.string.app_detail_not_found, -1).show();
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            Intent intent = new Intent(NotificationsRegistryActivity.this, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", appInfo);
            NotificationsRegistryActivity notificationsRegistryActivity = NotificationsRegistryActivity.this;
            notificationsRegistryActivity.startActivity(intent, UptodownApp.f29058B.a(notificationsRegistryActivity));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Z4.v {
        d() {
        }

        @Override // Z4.v
        public void a(int i8) {
            NotificationsRegistryActivity.this.u3(i8, 1);
        }

        @Override // Z4.v
        public void b(int i8) {
            NotificationsRegistryActivity.this.k3(i8);
        }

        @Override // Z4.v
        public void c(int i8) {
            NotificationsRegistryActivity.this.u3(i8, 0);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29714a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ NotificationsRegistryActivity f29716a;

            a(NotificationsRegistryActivity notificationsRegistryActivity) {
                this.f29716a = notificationsRegistryActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f29716a.n3().f11976b.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    this.f29716a.v3(((n.a) ((AbstractC3685y.c) abstractC3685y).a()).a());
                    this.f29716a.f29702Q = false;
                    this.f29716a.f29701P = false;
                    this.f29716a.n3().f11976b.f11842b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                }
                return O5.I.f8278a;
            }
        }

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f29714a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L e9 = NotificationsRegistryActivity.this.p3().e();
                a aVar = new a(NotificationsRegistryActivity.this);
                this.f29714a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29717a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f29717a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29717a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29718a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f29718a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29718a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29719a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29720b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29719a = function0;
            this.f29720b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29719a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29720b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29721a;

        /* renamed from: b, reason: collision with root package name */
        int f29722b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29723c;

        /* renamed from: e, reason: collision with root package name */
        int f29725e;

        i(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29723c = obj;
            this.f29725e |= Integer.MIN_VALUE;
            return NotificationsRegistryActivity.this.w3(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29726a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29728c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i8, S5.d dVar) {
            super(2, dVar);
            this.f29728c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(this.f29728c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29726a == 0) {
                O5.t.b(obj);
                String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault()).format(kotlin.coroutines.jvm.internal.b.d(System.currentTimeMillis()));
                AbstractC3255y.h(format, "formatter.format(System.currentTimeMillis())");
                n p32 = NotificationsRegistryActivity.this.p3();
                NotificationsRegistryActivity notificationsRegistryActivity = NotificationsRegistryActivity.this;
                C1208s c1208s = notificationsRegistryActivity.f29703R;
                AbstractC3255y.f(c1208s);
                Object obj2 = c1208s.a().get(this.f29728c);
                AbstractC3255y.h(obj2, "adapter!!.data[position]");
                p32.f(notificationsRegistryActivity, (a5.y) obj2, format);
                C1208s c1208s2 = NotificationsRegistryActivity.this.f29703R;
                AbstractC3255y.f(c1208s2);
                ((a5.y) c1208s2.a().get(this.f29728c)).k(NotificationsRegistryActivity.this.getString(R.string.file_deleted_notification, format));
                C1208s c1208s3 = NotificationsRegistryActivity.this.f29703R;
                AbstractC3255y.f(c1208s3);
                ((a5.y) c1208s3.a().get(this.f29728c)).i("no_action");
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29729a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29731c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i8, S5.d dVar) {
            super(2, dVar);
            this.f29731c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(this.f29731c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29729a == 0) {
                O5.t.b(obj);
                C1208s c1208s = NotificationsRegistryActivity.this.f29703R;
                AbstractC3255y.f(c1208s);
                c1208s.notifyItemChanged(this.f29731c);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k3(int i8) {
        C1208s c1208s = this.f29703R;
        if (c1208s != null) {
            AbstractC3255y.f(c1208s);
            if (c1208s.getItemCount() > i8) {
                n p32 = p3();
                C1208s c1208s2 = this.f29703R;
                AbstractC3255y.f(c1208s2);
                p32.c(this, ((a5.y) c1208s2.a().get(i8)).c());
                C1208s c1208s3 = this.f29703R;
                AbstractC3255y.f(c1208s3);
                c1208s3.a().remove(i8);
                C1208s c1208s4 = this.f29703R;
                AbstractC3255y.f(c1208s4);
                c1208s4.notifyItemRemoved(i8);
            }
        }
    }

    private final void l3(File file, int i8) {
        String string = getString(R.string.dialog_delete_download_msg, file.getName());
        AbstractC3255y.h(string, "getString(R.string.dialo…_download_msg, file.name)");
        Y1(string, new b(file, this, i8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r11.equals("preregister") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e4, code lost:
    
        if (r12 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:
    
        new V4.i(r10, java.lang.Long.parseLong(r12), new com.uptodown.activities.NotificationsRegistryActivity.c(r10), androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fb, code lost:
    
        com.google.android.material.snackbar.Snackbar.make(n3().f11977c, getString(com.uptodown.R.string.msg_no_action_available), -1).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        if (r11.equals("upcoming_release") == false) goto L62;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m3(java.lang.String r11, java.lang.String r12, int r13) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.NotificationsRegistryActivity.m3(java.lang.String, java.lang.String, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S n3() {
        return (S) this.f29699N.getValue();
    }

    private final void o3() {
        p3().d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n p3() {
        return (n) this.f29700O.getValue();
    }

    private final void q3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            n3().f11978d.setNavigationIcon(drawable);
            n3().f11978d.setNavigationContentDescription(getString(R.string.back));
        }
        n3().f11978d.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.p2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsRegistryActivity.r3(NotificationsRegistryActivity.this, view);
            }
        });
        n3().f11978d.inflateMenu(R.menu.menu_notifications_registry);
        n3().f11978d.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
        n3().f11978d.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: D4.q2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean s32;
                s32 = NotificationsRegistryActivity.s3(NotificationsRegistryActivity.this, menuItem);
                return s32;
            }
        });
        TextView textView = n3().f11980f;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        n3().f11979e.setTypeface(aVar.u());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        n3().f11977c.addItemDecoration(new q5.m(dimension, dimension));
        n3().f11977c.setLayoutManager(linearLayoutManager);
        n3().f11977c.setItemAnimator(new DefaultItemAnimator());
        n3().f11976b.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.r2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsRegistryActivity.t3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(NotificationsRegistryActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s3(NotificationsRegistryActivity this$0, MenuItem item) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(item, "item");
        if (item.getItemId() == R.id.action_delete_all) {
            this$0.p3().b(this$0);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u3(int i8, int i9) {
        C1208s c1208s = this.f29703R;
        if (c1208s != null) {
            AbstractC3255y.f(c1208s);
            if (c1208s.getItemCount() > i8) {
                C1208s c1208s2 = this.f29703R;
                AbstractC3255y.f(c1208s2);
                Object obj = c1208s2.a().get(i8);
                AbstractC3255y.h(obj, "adapter!!.data[position]");
                a5.y yVar = (a5.y) obj;
                if (yVar.a() != null) {
                    String a8 = yVar.a();
                    AbstractC3255y.f(a8);
                    List s02 = j6.n.s0(a8, new String[]{";"}, false, 0, 6, null);
                    if (s02.size() > i9) {
                        m3((String) s02.get(i9), yVar.b(), i8);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v3(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            C1208s c1208s = this.f29703R;
            if (c1208s == null) {
                this.f29703R = new C1208s(arrayList, this, this.f29704S);
                n3().f11977c.setAdapter(this.f29703R);
            } else {
                if (c1208s != null) {
                    c1208s.d(arrayList);
                }
                C1208s c1208s2 = this.f29703R;
                if (c1208s2 != null) {
                    c1208s2.notifyDataSetChanged();
                }
            }
            n3().f11979e.setVisibility(8);
            return;
        }
        C1208s c1208s3 = this.f29703R;
        if (c1208s3 != null) {
            c1208s3.d(new ArrayList());
        }
        C1208s c1208s4 = this.f29703R;
        if (c1208s4 != null) {
            c1208s4.notifyDataSetChanged();
        }
        n3().f11979e.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w3(int r7, S5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.uptodown.activities.NotificationsRegistryActivity.i
            if (r0 == 0) goto L13
            r0 = r8
            com.uptodown.activities.NotificationsRegistryActivity$i r0 = (com.uptodown.activities.NotificationsRegistryActivity.i) r0
            int r1 = r0.f29725e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29725e = r1
            goto L18
        L13:
            com.uptodown.activities.NotificationsRegistryActivity$i r0 = new com.uptodown.activities.NotificationsRegistryActivity$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29723c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f29725e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r8)
            goto L6d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r7 = r0.f29722b
            java.lang.Object r2 = r0.f29721a
            com.uptodown.activities.NotificationsRegistryActivity r2 = (com.uptodown.activities.NotificationsRegistryActivity) r2
            O5.t.b(r8)
            goto L59
        L3f:
            O5.t.b(r8)
            l6.I r8 = l6.C3347b0.b()
            com.uptodown.activities.NotificationsRegistryActivity$j r2 = new com.uptodown.activities.NotificationsRegistryActivity$j
            r2.<init>(r7, r5)
            r0.f29721a = r6
            r0.f29722b = r7
            r0.f29725e = r4
            java.lang.Object r8 = l6.AbstractC3360i.g(r8, r2, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r2 = r6
        L59:
            l6.J0 r8 = l6.C3347b0.c()
            com.uptodown.activities.NotificationsRegistryActivity$k r4 = new com.uptodown.activities.NotificationsRegistryActivity$k
            r4.<init>(r7, r5)
            r0.f29721a = r5
            r0.f29725e = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r8, r4, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.NotificationsRegistryActivity.w3(int, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(n3().getRoot());
        q3();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f29702Q) {
            o3();
        }
    }
}
