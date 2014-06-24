#include <stdio.h>
#include <string.h>
#include <math.h>

int main(){
  
  char s[256];
  char inv[256];
  char freq[26];
  int i, len, pangram;
  float H,p;

  scanf("%[^\n]s",s);

  len = strlen(s);
  inv[len] = '\0';

  for( i=0;i<len;i++ ){
    inv[i] = s[len-i-1];
  }
  printf("%s\n",inv);

  for( i=0;i<26;i++ )
    freq[i]=0;

  for( i=0;i<len;i++ ){
    freq[tolower(s[i])-'a']++;
  }

  pangram = 1;
  for( i=0;i<26;i++ ){
    if( !freq[i] ){
      pangram=0;
      break;
    }
  }

  if( pangram )
    printf("É pangram\n");
  else
    printf("Não é pangram\n");

  H = 0.0;
  for( i=0;i<26;i++ ){
    if( freq[i] ){
      p = freq[i]/(float)len;
      H -= p*log(p)/log(2.0);
    }
  }
  printf("%f\n",H);

  return 0;
}
