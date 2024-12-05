package D4;

import D4.U;
import E4.j;
import U4.S0;
import W4.InterfaceC1478a;
import X4.C1498h;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import d2.EnumC2540d;
import d2.InterfaceC2541e;
import e2.AbstractC2577a;
import f2.C2659a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import n5.C3480h;
import o5.AbstractC3548h;
import p5.C3609g;

/* loaded from: classes4.dex */
public final class U extends RecyclerView.Adapter {

    /* renamed from: a, reason: collision with root package name */
    private W4.s f1616a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1478a f1617b;

    /* renamed from: c, reason: collision with root package name */
    private Context f1618c;

    /* renamed from: d, reason: collision with root package name */
    private String f1619d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f1620e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1621f;

    /* renamed from: g, reason: collision with root package name */
    private YouTubePlayerView f1622g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC2541e f1623h;

    /* renamed from: i, reason: collision with root package name */
    private String f1624i;

    /* renamed from: j, reason: collision with root package name */
    private int f1625j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1626k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1627l;

    /* renamed from: m, reason: collision with root package name */
    private C3480h f1628m;

    /* renamed from: n, reason: collision with root package name */
    private int f1629n;

    /* loaded from: classes4.dex */
    public final class a extends AbstractC3548h {

        /* renamed from: b, reason: collision with root package name */
        private W4.s f1630b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC1478a f1631c;

        /* renamed from: d, reason: collision with root package name */
        private Context f1632d;

        /* renamed from: e, reason: collision with root package name */
        private String f1633e;

        /* renamed from: f, reason: collision with root package name */
        private final ImageView f1634f;

        /* renamed from: g, reason: collision with root package name */
        private final RelativeLayout f1635g;

        /* renamed from: h, reason: collision with root package name */
        private final ProgressBar f1636h;

        /* renamed from: i, reason: collision with root package name */
        private final ImageView f1637i;

        /* renamed from: j, reason: collision with root package name */
        private final TextView f1638j;

        /* renamed from: k, reason: collision with root package name */
        private final TextView f1639k;

        /* renamed from: l, reason: collision with root package name */
        private final TextView f1640l;

        /* renamed from: m, reason: collision with root package name */
        private final TextView f1641m;

        /* renamed from: n, reason: collision with root package name */
        private final TextView f1642n;

        /* renamed from: o, reason: collision with root package name */
        private final LinearLayout f1643o;

        /* renamed from: p, reason: collision with root package name */
        private final CardView f1644p;

        /* renamed from: q, reason: collision with root package name */
        private final View f1645q;

        /* renamed from: r, reason: collision with root package name */
        private final int f1646r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ U f1647s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U u8, View itemView, W4.s listener, InterfaceC1478a actionsClickListener, Context context, String fragmentName) {
            super(itemView, context);
            AbstractC3159y.i(itemView, "itemView");
            AbstractC3159y.i(listener, "listener");
            AbstractC3159y.i(actionsClickListener, "actionsClickListener");
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(fragmentName, "fragmentName");
            this.f1647s = u8;
            this.f1630b = listener;
            this.f1631c = actionsClickListener;
            this.f1632d = context;
            this.f1633e = fragmentName;
            View findViewById = itemView.findViewById(R.id.iv_image_video_featured_item);
            AbstractC3159y.h(findViewById, "itemView.findViewById(R.…mage_video_featured_item)");
            this.f1634f = (ImageView) findViewById;
            View findViewById2 = itemView.findViewById(R.id.rl_video_card_info);
            AbstractC3159y.h(findViewById2, "itemView.findViewById(R.id.rl_video_card_info)");
            this.f1635g = (RelativeLayout) findViewById2;
            View findViewById3 = itemView.findViewById(R.id.pb_progress_video_featured_item);
            AbstractC3159y.h(findViewById3, "itemView.findViewById(R.…ress_video_featured_item)");
            this.f1636h = (ProgressBar) findViewById3;
            View findViewById4 = itemView.findViewById(R.id.iv_logo_video_featured_item);
            AbstractC3159y.h(findViewById4, "itemView.findViewById(R.…logo_video_featured_item)");
            this.f1637i = (ImageView) findViewById4;
            View findViewById5 = itemView.findViewById(R.id.tv_name_video_featured_item);
            AbstractC3159y.h(findViewById5, "itemView.findViewById(R.…name_video_featured_item)");
            TextView textView = (TextView) findViewById5;
            this.f1638j = textView;
            View findViewById6 = itemView.findViewById(R.id.tv_desc_video_featured_item);
            AbstractC3159y.h(findViewById6, "itemView.findViewById(R.…desc_video_featured_item)");
            TextView textView2 = (TextView) findViewById6;
            this.f1639k = textView2;
            View findViewById7 = itemView.findViewById(R.id.tv_status_video_featured_item);
            AbstractC3159y.h(findViewById7, "itemView.findViewById(R.…atus_video_featured_item)");
            this.f1640l = (TextView) findViewById7;
            View findViewById8 = itemView.findViewById(R.id.tv_progress_video_featured_item);
            AbstractC3159y.h(findViewById8, "itemView.findViewById(R.…ress_video_featured_item)");
            TextView textView3 = (TextView) findViewById8;
            this.f1641m = textView3;
            View findViewById9 = itemView.findViewById(R.id.tv_verified_video_featured_item);
            AbstractC3159y.h(findViewById9, "itemView.findViewById(R.…fied_video_featured_item)");
            TextView textView4 = (TextView) findViewById9;
            this.f1642n = textView4;
            View findViewById10 = itemView.findViewById(R.id.ll_progress_video_featured_item);
            AbstractC3159y.h(findViewById10, "itemView.findViewById(R.…ress_video_featured_item)");
            this.f1643o = (LinearLayout) findViewById10;
            View findViewById11 = itemView.findViewById(R.id.cv_youtube_player_view);
            AbstractC3159y.h(findViewById11, "itemView.findViewById(R.id.cv_youtube_player_view)");
            this.f1644p = (CardView) findViewById11;
            View findViewById12 = itemView.findViewById(R.id.v_player_controller);
            AbstractC3159y.h(findViewById12, "itemView.findViewById(R.id.v_player_controller)");
            this.f1645q = findViewById12;
            this.f1646r = UptodownApp.f28003B.H();
            j.a aVar = E4.j.f2274g;
            textView.setTypeface(aVar.t());
            textView2.setTypeface(aVar.u());
            textView3.setTypeface(aVar.u());
            textView4.setTypeface(aVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(a this$0, C1498h app, int i8, View view) {
            AbstractC3159y.i(this$0, "this$0");
            AbstractC3159y.i(app, "$app");
            this$0.f1631c.a(app, i8);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(U this$0, View view) {
            AbstractC3159y.i(this$0, "this$0");
            if (this$0.q()) {
                InterfaceC2541e interfaceC2541e = this$0.f1623h;
                if (interfaceC2541e != null) {
                    interfaceC2541e.pause();
                    return;
                }
                return;
            }
            InterfaceC2541e interfaceC2541e2 = this$0.f1623h;
            if (interfaceC2541e2 != null) {
                interfaceC2541e2.play();
            }
        }

        private final void r(C1498h c1498h) {
            i(c1498h, this.f1638j, this.f1639k);
            c(this.f1635g, this.f1630b, c1498h);
            C3609g c3609g = new C3609g((int) this.f1632d.getResources().getDimension(R.dimen.border_radius_m), null, 2, null);
            String e02 = c1498h.e0();
            if (e02 != null && e02.length() != 0) {
                UptodownApp.a aVar = UptodownApp.f28003B;
                if (aVar.A() > 0) {
                    this.f1634f.setLayoutParams(new RelativeLayout.LayoutParams(-1, aVar.A()));
                    com.squareup.picasso.s.h().l(c1498h.c0()).m(aVar.B(), aVar.A()).n(c3609g).i(this.f1634f);
                } else {
                    this.f1634f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                    com.squareup.picasso.s.h().l(c1498h.c0()).f().n(c3609g).i(this.f1634f);
                }
            } else {
                this.f1634f.setImageDrawable(ContextCompat.getDrawable(this.f1632d, R.drawable.shape_bg_placeholder));
            }
            h(this.f1637i, c1498h.m0());
        }

        public final void n(final C1498h app, final int i8) {
            AbstractC3159y.i(app, "app");
            this.f1644p.setVisibility(8);
            this.f1645q.setVisibility(8);
            this.f1634f.setVisibility(0);
            r(app);
            e(app, this.f1636h, this.f1637i, this.f1639k, this.f1641m, this.f1640l, this.f1643o);
            this.f1635g.setOnLongClickListener(new View.OnLongClickListener() { // from class: D4.T
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean o8;
                    o8 = U.a.o(U.a.this, app, i8, view);
                    return o8;
                }
            });
            this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(this.f1646r, -1), this.f1632d, i8, this.f1647s.f1629n));
            c(this.f1634f, this.f1630b, app);
        }

        public final void p(C1498h app, int i8) {
            ArrayList i12;
            AbstractC3159y.i(app, "app");
            if (this.f1647s.f1622g != null) {
                YouTubePlayerView youTubePlayerView = this.f1647s.f1622g;
                AbstractC3159y.f(youTubePlayerView);
                if (youTubePlayerView.getParent() != null) {
                    YouTubePlayerView youTubePlayerView2 = this.f1647s.f1622g;
                    AbstractC3159y.f(youTubePlayerView2);
                    ViewParent parent = youTubePlayerView2.getParent();
                    AbstractC3159y.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(this.f1647s.f1622g);
                }
                this.f1644p.addView(this.f1647s.f1622g);
                this.f1644p.setVisibility(0);
                this.f1645q.setVisibility(0);
                this.f1634f.setVisibility(8);
                r(app);
                View view = this.f1645q;
                final U u8 = this.f1647s;
                view.setOnClickListener(new View.OnClickListener() { // from class: D4.S
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        U.a.q(U.this, view2);
                    }
                });
                this.itemView.setLayoutParams(b(new RelativeLayout.LayoutParams(this.f1646r, -1), this.f1632d, i8, this.f1647s.f1629n));
                if (this.f1647s.p() && this.f1647s.f1623h != null && (i12 = app.i1()) != null && !i12.isEmpty()) {
                    ArrayList i13 = app.i1();
                    AbstractC3159y.f(i13);
                    if (((X4.T) i13.get(0)).getId() != null) {
                        U u9 = this.f1647s;
                        StringBuilder sb = new StringBuilder();
                        String s02 = app.s0();
                        AbstractC3159y.f(s02);
                        sb.append(s02);
                        sb.append(this.f1633e);
                        u9.f1624i = sb.toString();
                        if (AbstractC3159y.d(this.f1633e, kotlin.jvm.internal.U.b(S0.class).b())) {
                            UptodownApp.f28003B.o0(this.f1647s.f1623h);
                        } else {
                            UptodownApp.f28003B.p0(this.f1647s.f1623h);
                        }
                        UptodownApp.a aVar = UptodownApp.f28003B;
                        if (aVar.f(this.f1632d) && SettingsPreferences.f29323b.l(this.f1632d) > 0) {
                            if (aVar.J().containsKey(this.f1647s.f1624i)) {
                                InterfaceC2541e interfaceC2541e = this.f1647s.f1623h;
                                AbstractC3159y.f(interfaceC2541e);
                                ArrayList i14 = app.i1();
                                AbstractC3159y.f(i14);
                                String id = ((X4.T) i14.get(0)).getId();
                                AbstractC3159y.f(id);
                                Object obj = aVar.J().get(this.f1647s.f1624i);
                                AbstractC3159y.f(obj);
                                interfaceC2541e.e(id, ((Number) obj).floatValue());
                            } else {
                                InterfaceC2541e interfaceC2541e2 = this.f1647s.f1623h;
                                AbstractC3159y.f(interfaceC2541e2);
                                ArrayList i15 = app.i1();
                                AbstractC3159y.f(i15);
                                String id2 = ((X4.T) i15.get(0)).getId();
                                AbstractC3159y.f(id2);
                                interfaceC2541e2.e(id2, 0.0f);
                                aVar.J().put(this.f1647s.f1624i, Float.valueOf(0.0f));
                            }
                            if (this.f1647s.n()) {
                                InterfaceC2541e interfaceC2541e3 = this.f1647s.f1623h;
                                AbstractC3159y.f(interfaceC2541e3);
                                interfaceC2541e3.play();
                                return;
                            } else {
                                InterfaceC2541e interfaceC2541e4 = this.f1647s.f1623h;
                                AbstractC3159y.f(interfaceC2541e4);
                                interfaceC2541e4.pause();
                                return;
                            }
                        }
                        if (aVar.J().containsKey(this.f1647s.f1624i)) {
                            InterfaceC2541e interfaceC2541e5 = this.f1647s.f1623h;
                            AbstractC3159y.f(interfaceC2541e5);
                            ArrayList i16 = app.i1();
                            AbstractC3159y.f(i16);
                            String id3 = ((X4.T) i16.get(0)).getId();
                            AbstractC3159y.f(id3);
                            Object obj2 = aVar.J().get(this.f1647s.f1624i);
                            AbstractC3159y.f(obj2);
                            interfaceC2541e5.d(id3, ((Number) obj2).floatValue());
                        } else {
                            InterfaceC2541e interfaceC2541e6 = this.f1647s.f1623h;
                            AbstractC3159y.f(interfaceC2541e6);
                            ArrayList i17 = app.i1();
                            AbstractC3159y.f(i17);
                            String id4 = ((X4.T) i17.get(0)).getId();
                            AbstractC3159y.f(id4);
                            interfaceC2541e6.d(id4, 0.0f);
                            aVar.J().put(this.f1647s.f1624i, Float.valueOf(0.0f));
                        }
                        String e02 = app.e0();
                        if (e02 != null && e02.length() != 0) {
                            C3480h c3480h = this.f1647s.f1628m;
                            AbstractC3159y.f(c3480h);
                            c3480h.l().setVisibility(0);
                            return;
                        }
                        return;
                    }
                }
                ArrayList i18 = app.i1();
                if (i18 == null || i18.isEmpty()) {
                    n(app, i8);
                }
                if (this.f1647s.f1623h == null) {
                    this.f1647s.o();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends AbstractC2577a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1649b;

        b(View view) {
            this.f1649b = view;
        }

        @Override // e2.AbstractC2577a, e2.c
        public void g(InterfaceC2541e youTubePlayer) {
            AbstractC3159y.i(youTubePlayer, "youTubePlayer");
            super.g(youTubePlayer);
            UptodownApp.a aVar = UptodownApp.f28003B;
            if (aVar.A() == 0) {
                YouTubePlayerView youTubePlayerView = U.this.f1622g;
                AbstractC3159y.f(youTubePlayerView);
                if (youTubePlayerView.getHeight() != 0) {
                    YouTubePlayerView youTubePlayerView2 = U.this.f1622g;
                    AbstractC3159y.f(youTubePlayerView2);
                    aVar.F0(youTubePlayerView2.getHeight());
                    YouTubePlayerView youTubePlayerView3 = U.this.f1622g;
                    AbstractC3159y.f(youTubePlayerView3);
                    aVar.G0(youTubePlayerView3.getWidth());
                }
            }
            U u8 = U.this;
            u8.f1628m = new C3480h(this.f1649b, youTubePlayer, u8.f1618c);
            C3480h c3480h = U.this.f1628m;
            AbstractC3159y.f(c3480h);
            youTubePlayer.a(c3480h);
            youTubePlayer.f();
            U.this.f1623h = youTubePlayer;
            U.this.v(true);
            U.this.notifyItemChanged(0);
        }

        @Override // e2.AbstractC2577a, e2.c
        public void i(InterfaceC2541e youTubePlayer, float f8) {
            AbstractC3159y.i(youTubePlayer, "youTubePlayer");
            super.i(youTubePlayer, f8);
            UptodownApp.f28003B.J().put(U.this.f1624i, Float.valueOf(f8));
        }

        @Override // e2.AbstractC2577a, e2.c
        public void j(InterfaceC2541e youTubePlayer, EnumC2540d state) {
            AbstractC3159y.i(youTubePlayer, "youTubePlayer");
            AbstractC3159y.i(state, "state");
            super.j(youTubePlayer, state);
            EnumC2540d enumC2540d = EnumC2540d.BUFFERING;
            if (state == enumC2540d && U.this.n()) {
                youTubePlayer.play();
            }
            if (state == enumC2540d && AbstractC3159y.d(U.this.f1619d, kotlin.jvm.internal.U.b(S0.class).b())) {
                youTubePlayer.play();
            }
            if (state == EnumC2540d.PAUSED) {
                U.this.x(false);
            }
            if (state == EnumC2540d.PLAYING) {
                U.this.x(true);
            }
        }
    }

    public U(W4.s listener, InterfaceC1478a actionsClickListener, Context context, String fragmentName) {
        AbstractC3159y.i(listener, "listener");
        AbstractC3159y.i(actionsClickListener, "actionsClickListener");
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(fragmentName, "fragmentName");
        this.f1616a = listener;
        this.f1617b = actionsClickListener;
        this.f1618c = context;
        this.f1619d = fragmentName;
        this.f1620e = new ArrayList();
        this.f1624i = "";
        this.f1627l = true;
        this.f1629n = 8;
        if (!SettingsPreferences.f29323b.L(this.f1618c)) {
            try {
                YouTubePlayerView youTubePlayerView = new YouTubePlayerView(this.f1618c);
                youTubePlayerView.setEnableAutomaticInitialization(false);
                this.f1622g = youTubePlayerView;
                o();
            } catch (Exception e8) {
                SettingsPreferences.f29323b.F0(this.f1618c, true);
                this.f1622g = null;
                e8.printStackTrace();
            } catch (UnsatisfiedLinkError e9) {
                SettingsPreferences.f29323b.F0(this.f1618c, true);
                this.f1622g = null;
                e9.printStackTrace();
            }
        }
        if (AbstractC3159y.d(this.f1619d, kotlin.jvm.internal.U.b(S0.class).b())) {
            this.f1629n = 8;
        } else {
            this.f1629n = 20;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        YouTubePlayerView youTubePlayerView = this.f1622g;
        if (youTubePlayerView != null) {
            AbstractC3159y.f(youTubePlayerView);
            View d8 = youTubePlayerView.d(R.layout.home_youtube_player_layout);
            C2659a c8 = new C2659a.C0738a().e(0).h(0).g(3).d(1).c();
            YouTubePlayerView youTubePlayerView2 = this.f1622g;
            AbstractC3159y.f(youTubePlayerView2);
            youTubePlayerView2.e(new b(d8), c8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1620e.size();
    }

    public final ArrayList l() {
        return this.f1620e;
    }

    public final int m() {
        return this.f1625j;
    }

    public final boolean n() {
        return this.f1621f;
    }

    public final boolean p() {
        return this.f1626k;
    }

    public final boolean q() {
        return this.f1627l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i8) {
        AbstractC3159y.i(holder, "holder");
        int i9 = i8 + 1;
        if (!SettingsPreferences.f29323b.L(this.f1618c) && i8 == this.f1625j) {
            Object obj = this.f1620e.get(i8);
            AbstractC3159y.h(obj, "apps[position]");
            holder.p((C1498h) obj, i9);
        } else {
            Object obj2 = this.f1620e.get(i8);
            AbstractC3159y.h(obj2, "apps[position]");
            holder.n((C1498h) obj2, i9);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i8) {
        AbstractC3159y.i(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_video_featured_item, parent, false);
        AbstractC3159y.h(itemView, "itemView");
        return new a(this, itemView, this.f1616a, this.f1617b, this.f1618c, this.f1619d);
    }

    public final void t(int i8) {
        this.f1625j = i8;
    }

    public final void u(ArrayList appList) {
        AbstractC3159y.i(appList, "appList");
        ArrayList arrayList = this.f1620e;
        arrayList.clear();
        arrayList.addAll(appList);
    }

    public final void v(boolean z8) {
        this.f1626k = z8;
    }

    public final void w(boolean z8) {
        this.f1621f = z8;
    }

    public final void x(boolean z8) {
        this.f1627l = z8;
    }
}
