#include <bits/stdc++.h>
using namespace std;
#define fl(i, a, b) for (long long int i = (a); i < (b); i++)
#define flr(i, a, b) for(long long int i = (a); i >=(b); i--)
#define itr(i, A) for(auto i=A.begin(); i != A.end(); ++i)
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
 
int main(){
ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int A[6][6];
    for(int i=0;i<6;i++) 
        for(int j=0;j<6;j++)
            cin >> A[i][j];

    VI v;
    for(int i=0;i<=3;i++){
        for(int j=0;j<=3;j++){
            int sum = A[i][j] + A[i][j+1] + A[i][j+2] + A[i+1][j+1] + A[i+2][j] + A[i+2][j+1] + A[i+2][j+2];
            v.pb(sum);
        }
    }
    sort(v.begin(), v.end()); 
    cout << v[v.size() - 1];
}
