package library;

public class CardCatalog {
	String title[];
    String author[];
    String subject[];
    static int count=0;
    Library cards[];
    CardCatalog()
    {
        this.title=new String[10];
        this.author=new String[10];
        this.subject=new String[10];
        this.cards=new Library[10];
    }
    
    public void  addACard(Library card){
    	title[count]=card.title;
        author[count]=card.author;
        subject[count]= card.subject;
        cards[count]=card;
        count=count+1;
        
    }
    
    public Library  getATitle(String title){
    	for(int i=0;i<cards.length;i++)
    	{
            if(cards[i].getTitle().equals(title))
            {
            	 return cards[i];
            }
        }
    	 return null;
    }
    
    public String[] getAnAuthor(String author){
    	String books[]=new String[10];
        int temp=0;
        for(int i=0;i<cards.length;i++){
            if (cards[i]!=null){
                if(cards[i].getAuthor().equals(author)){
                    books[temp]=cards[i].getTitle();
                    temp=temp+1;
                }
            }

        }
        return books;

    }
    public Library getSubject(String subject){
    	for(int i=0;i<cards.length;i++){
            if(cards[i].getSubject().equals(subject)){
                return cards[i];
            }
        }
        return null;
    	
    
    }
    public void  removeATitle(String title){
    	for(int i=0;i<cards.length;i++) {
    		if(cards[i].getTitle().equals(title) || cards[i].equals(null)) {
    			cards[i]=null;
    			count=count-1;
    		}
    		else {
    			System.out.println(cards[i]);
    		}
    	}

    }
    public void  printTheCatalog(){
    	System.out.println(count);
        for (int i=0;i<count;i++){
            if(!(cards[i].equals(null)))
                System.out.println(cards[i]);
        }
    }


}
    



