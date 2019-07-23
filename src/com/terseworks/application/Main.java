//********************************************************************************
// Main.java
//
// Written by: John Meschke
// Description: Main program entry point.
//********************************************************************************

package com.terseworks.application;

import com.terseworks.math.Circle2D;
import com.terseworks.math.Closest2D;
import com.terseworks.math.Collide2D;
import com.terseworks.math.Contact2D;
import com.terseworks.math.Intersect2D;
import com.terseworks.math.Plane2D;
import com.terseworks.math.RayCast2D;
import com.terseworks.math.Rectangle2D;
import com.terseworks.math.Vector2D;

public class Main
{
	public static void printContactInfo(Contact2D contact)
	{
		System.out.println("Normal: (" + contact.normal.x + ", " + contact.normal.y + ")");
		System.out.println("Tangent: (" + contact.tangent.x + ", " + contact.tangent.y + ")");
		System.out.println("Depth: " + contact.depth);
	}
	
	public static void main(String[] args)
	{
		// Rectangle in rectangle test.
		Rectangle2D rect1 = new Rectangle2D(-3.0F, -3.0F, 3.0F, 3.0F);
		Rectangle2D rect2 = new Rectangle2D(1.0F, 2.0F, 7.0F, 8.0F);
		if (Intersect2D.rectangleInRectangle(rect1, rect2))
		{
			System.out.println("Rectangles intersect.");
			Contact2D result = new Contact2D();
			Collide2D.rectangleInRectangle(rect1, rect2, result);
			printContactInfo(result);
		}
		else
		{
			System.out.println("Rectangles do not intersect.");
		}
		System.out.println();
		
		// Closest point in plane test.
		Vector2D point1 = new Vector2D(5.0F, 5.0F);
		Plane2D plane1 = new Plane2D(0.0F, 1.0F, -2.0F);
		Vector2D closest = new Vector2D();
		Closest2D.pointInPlane(point1, plane1, closest);
		System.out.println("Closest point in plane: (" + closest.x + ", " + closest.y + ")");
		System.out.println();
		
		// Ray cast in circle test.
		Vector2D rayFrom1 = new Vector2D(0.0F, 0.0F);
		Vector2D rayTo1 = new Vector2D(6.0F, 8.0F);
		Circle2D circle1 = new Circle2D(5.0F, 5.0F, 2.0F);
		Vector2D hit = new Vector2D();
		if (RayCast2D.rayInCircle(rayFrom1, rayTo1, circle1, hit))
		{
			System.out.println("Ray and circle intersect.");
			System.out.println("Hit circle at: (" + hit.x + ", " + hit.y + ")");
		}
		else
		{
			System.out.println("Ray and circle do not intersect.");
		}
		System.out.println();
	}
}
