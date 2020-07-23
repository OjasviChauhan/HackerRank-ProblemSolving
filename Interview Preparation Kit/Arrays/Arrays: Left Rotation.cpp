#include <bits/stdc++.h>
using namespace std;
#define fl(i, a, b) for (long long int i = (a); i < (b); i++)
#define flr(i, a, b) for(long long int i = (a); i >=(b); i--)
#define itr(i, V) for(auto i=V.begin(); i != V.end(); ++i)
#define pb push_back
#define mp make_pair
#define endl '\n'
typedef long long int ll;
typedef vector<int> VI;
ll mod1=1000000007;
ll mod2=67280421310721;
ll mod3=998244353;
ll INF=1e18;
ll gcd(ll a,ll b) { return b?gcd(b,a%b):a;}
 
void rotate(int A[],int n, int d){
    fl(i,d,n){
        cout<<A[i]<<" ";
    }
    fl(i,0,d){
        cout<<A[i]<<" ";
    }
}

int main(){
ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n,d;
    cin>>n>>d;
    int A[n];
    fl(i,0,n) 
        cin >> A[i];
    rotate(A,n,d);
    return 0;
}
