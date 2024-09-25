package DataStructuer;

class TLNode <E>{

	E data;
	TLNode<E> left,right;
	
	TLNode(E d)
	{
		data=d;
        left=null;
        right=null;
	}
    TLNode()
	{
		data=null;
        left=null;
        right=null;
	}
    
 }